// Get the modal
var modal = document.getElementById("passportModal");

// Get the image and insert it inside the modal - use its "alt" text as a caption
var modalImg = document.getElementById("passportImage");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

// When the user clicks on the button, open the modal 
function showModal(imageSrc) {
  modal.style.display = "block";
  modalImg.src = imageSrc;
}

// When the user clicks on <span> (x), close the modal
span.onclick = function() { 
  modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}