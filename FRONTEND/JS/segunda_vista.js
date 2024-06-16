
function save() {
    var data = {
        'firstname': $('#firstname').val(),
        'phone': $('#phone').val(),
        'lastname': $('#lastname').val(),
        'passportNumber': $('#passportNumber').val(),
        'passportPhoto': $('#passportPhoto').val(),
        'birthDate': $('#birthDate').val(),
        'passportCountryId': { 
            'id': $('#passportCountryId').val()
        },
        'state': $('#state').val() == 1 ? true : false
    };

    var jsonData = JSON.stringify(data);

    $.ajax({
        url: 'http://localhost:9000/session3/v1/api/tickets',
        method: 'POST',
        dataType: 'json',
        contentType: 'application/json',
        data: jsonData,
        success: function(data) {
            alert("Registro guardado.");
            loadData();
            clearData();
        },
        error: function(xhr, status, error) {
            console.error('Error al guardar: ', xhr.responseText);
        }
    });
}


function loadData(){
    $.ajax({
        url: 'http://localhost:9000/session3/v1/api/tickets', 
        method : 'GET',
        dataType : 'json',
        success : function(response){
            var html = '';
            var data = response.data;

            if(Array.isArray(data)){
                data.forEach(function(item){
                    html += `<tr>
                    <td>${item.firstname}</td>
                    <td>${item.lastname}</td>
                    <td>${item.birthDate}</td>
                    <td>${item.passportNumber}</td>
                    <td>${item.passportCountryId.name}</td>
                    <td>${item.phone}</td>
                    <td><button onclick="showModal('${item.passportPhoto}')" class="btn-ver-pasaporte">Ver pasaporte</button></td>
                    <td>${item.state === true ? 'Activo': 'Inactivo'}</td>
                    <td><button onclick="findById(${item.id})">Editar</button></td>
                    <td><button onclick="deleteById(${item.id})">Eliminar</button></td>
                    </tr>`;
                });
            } else {
                console.error('El atributo "data" no es un arreglo: ', data);
            }
            $('#resultData').html(html);
        },
        error : function(error){
            console.error('Error al cargar: ', error);
        }
    });
}


function loadContrie(){
    $.ajax({
        url: 'http://localhost:9000/session3/v1/api/countries', 
        method : 'GET',
        dataType : 'json',
        success : function (response){
            var options = '';
            if(response.status && Array.isArray(response.data)){
                response.data.forEach(function(passportCountryId){
                    options += `<option value="${passportCountryId.id}">${passportCountryId.name}</option>`;
                }); 
                $('#passportCountryId').html(options);
            } else {
                console.error('La estructura no es la esperada: ', response);
            }
        },
        error : function(error){
            console.error('Error al cargar los routesIDs');
        }
    });
}


function loadRole(){
    $.ajax({
        url: 'http://localhost:9000/session3/v1/api/role',
        method: "GET",
        dataType: 'json',
        success: function(response) {
            if (response.status && Array.isArray(response.data)) {
                var roles = response.data.map(function(role) {
                    return {
                        label: role.name, // Mostrar nombre y apellido
                        value: role.id // El valor que se enviará cuando se seleccione un elemento
                    };
                });
                
                // Inicializar el autocompletado en el campo de entrada #person
                $('#role').autocomplete({
                    source : function(request, response){
                        var results = $.ui.autocomplete.filter(roles, request.term);
                        if (!results.length){
                            results = [{label : 'No se encontraron resultados', value: null}];
                        }
                        response(results);
                    },
                    select: function(event, ui){
                        $("#role_id").val(ui.item.value);
                        $("#role").val(ui.item.label);
                        console.log("ID de empresa seleccionada: " + ui.item.value);
                        return false;
                    }
    });
} else {
    console.error("No se obtuvo la lista de personas.");
}
        },
        error : function(error){
            console.error("Error de la solicitur: ",error);
        }
    });
}

$(document).ready(function() {

    var modal = document.getElementById("passportModal");
    var modalImg = document.getElementById("passportImage");

    var span = document.getElementsByClassName("close")[0];

    window.showModal = function(imageSrc) {
      modal.style.display = "block";
      modalImg.src = imageSrc;
    }

    span.onclick = function() { 
      modal.style.display = "none";
    }

    window.onclick = function(event) {
      if (event.target == modal) {
        modal.style.display = "none";
      }
    }
});


