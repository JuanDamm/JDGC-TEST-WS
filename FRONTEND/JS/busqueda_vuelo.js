$(document).ready(function() {
    $('#buscar_vuelos').click(function() {
        var date = $('#fecha_salida').val();
        var startDate = $('#fecha_inicio').val();
        var endDate = $('#fecha_fin').val();
        var departureAirportId = $('#origen').val();
        var arrivalAirportId = $('#destino').val();
        var visualizarTresDias = $('#visualizar_salida').prop('checked');
        var visualizarTresDiasRegreso = $('#visualizar_regreso').prop('checked');

        $.ajax({
            url: 'http://localhost:9000/session3/v1/api/schedules/buscar',
            method: 'GET',
            dataType: 'json',
            data: {
                date: date,
                startDate: startDate,
                endDate: endDate,
                departureAirportId: departureAirportId,
                arrivalAirportId: arrivalAirportId,
                visualizarTresDias: visualizarTresDias,
                visualizarTresDiasRegreso: visualizarTresDiasRegreso
            },
            success: function(response) {
                console.log('Response:', response);
                
                var departureHtml = '';
                if (response && Array.isArray(response)) {
                    response.forEach(function(item) {
                        if (item.routesID && item.routesID.departureAirport && item.routesID.arrivalAirport) {
                            departureHtml += `<tr>
                                <td>${item.routesID.departureAirport.iata_code}</td>
                                <td>${item.routesID.arrivalAirport.iata_code}</td>
                                <td>${formatDate(item.date)}</td>
                                <td>${formatTime(item.time)}</td>
                                <td>${item.flightNumber}</td>
                                <td>${item.economyPrice}</td>
                            </tr>`;
                        }
                    });
                }
                if (departureHtml === '') {
                    $('#salida_vuelos').html('<tr><td colspan="6">No se encontraron vuelos de salida.</td></tr>');
                } else {
                    $('#salida_vuelos').html(departureHtml);
                }

                var returnHtml = '';
                if (response && Array.isArray(response.returnFlights)) {
                    response.returnFlights.forEach(function(item) {
                        if (item.routesID && item.routesID.departureAirport && item.routesID.arrivalAirport) {
                            returnHtml += `<tr>
                                <td>${item.routesID.departureAirport.iata_code}</td>
                                <td>${item.routesID.arrivalAirport.iata_code}</td>
                                <td>${formatDate(item.date)}</td>
                                <td>${formatTime(item.time)}</td>
                                <td>${item.flightNumber}</td>
                                <td>${item.economyPrice}</td>
                            </tr>`;
                        }
                    });
                }
                if (returnHtml === '') {
                    $('#regreso_vuelos').html('<tr><td colspan="6">No se encontraron vuelos de regreso.</td></tr>');
                } else {
                    $('#regreso_vuelos').html(returnHtml);
                }
            },
            error: function(error) {
                console.error('Error al buscar vuelos:', error);
                $('#salida_vuelos').html('<tr><td colspan="6">Error al buscar vuelos de salida.</td></tr>');
                $('#regreso_vuelos').html('<tr><td colspan="6">Error al buscar vuelos de regreso.</td></tr>');
            }
        });
    });

    function formatDate(dateString) {
        var date = new Date(dateString);
        return `${date.getDate()}/${date.getMonth() + 1}/${date.getFullYear()}`;
    }

    function formatTime(timeString) {
        if (typeof timeString === 'string') {
            if (timeString.includes('.')) {
                const [hours, fraction] = timeString.split('.');
                const minutes = Math.round((parseFloat('0.' + fraction) * 60));
                return `${hours.padStart(2, '0')}:${minutes.toString().padStart(2, '0')}`;
            }
            return timeString.substring(0, 5);
        } else if (typeof timeString === 'number') {
            const hours = Math.floor(timeString);
            const minutes = Math.round((timeString - hours) * 60);
            return `${hours.toString().padStart(2, '0')}:${minutes.toString().padStart(2, '0')}`;
        } else {
            console.error('Invalid time format:', timeString);
            return 'Invalid time';
        }
    }
});

function cargarOrigen(){
    $.ajax({
        url: 'http://localhost:9000/session3/v1/api/routes', 
        method : 'GET',
        dataType : 'json',
        success : function (response){
            var options = '';
            if(response.status && Array.isArray(response.data)){
                response.data.forEach(function(routesID){
                    options += `<option value="${routesID.id}">${routesID.departureAirport.iata_code} - ${routesID.arrivalAirport.iata_code}</option>`;
                }); 
                $('#origen').html(options);
            } else {
                console.error('La estructura no es la esperada: ', response);
            }
        },
        error : function(error){
            console.error('Error al cargar los routesIDs');
        }
    });
}

function cargarDestino(){
    $.ajax({
        url: 'http://localhost:9000/session3/v1/api/routes', 
        method : 'GET',
        dataType : 'json',
        success : function (response){
            var options = '';
            if(response.status && Array.isArray(response.data)){
                response.data.forEach(function(routesID){
                    options += `<option value="${routesID.id}">${routesID.arrivalAirport.iata_code} - ${routesID.departureAirport.iata_code}</option>`;
                });
                $('#destino').html(options);
            } else {
                console.error('La estructura no es la esperada: ', response);
            }
        },
        error : function(error){
            console.error('Error al cargar los routesIDs');
        }
    });
}