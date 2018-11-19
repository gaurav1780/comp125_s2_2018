'use strict';

$(document).ready(function(){
  $('#01-introduction').click(function(e) {
    // Kill click event, otherwise Bootstrap will treat it as a click outside of the dropdown and immediately close it.
    // Source: https://stackoverflow.com/questions/22842903/how-to-open-bootstrap-dropdown-programmatically
    e.stopPropagation();
    // Toggle class 'open'.
    $("#lecture-nav-bar").toggleClass("open");
    // Toggle aria-expanded attribute
    // Source: https://stackoverflow.com/questions/26340129/jquery-toggle-attribute-value
    if($('.dropdown-toggle').attr('aria-expanded')==='true'){
           //alert("true");
           $('.dropdown-toggle').attr('aria-expanded','false');
    }
    else{
        $('.dropdown-toggle').attr('aria-expanded','true');
    }
    
    // Toggle ul
    
    $('#01-introduction-navbar').css('display', 'block');
    $('#01-introduction-navbar').css('top', '0%');
    $('#01-introduction-navbar').css('left', '100%');
    $('#01-introduction-navbar').css('position', 'absolute');
    // Set timeout so it revertws back to hidden.
    //
    function removeStyling() {
      $('#01-introduction-navbar').css('display', '');
      $('#01-introduction-navbar').css('top', '');
      $('#01-introduction-navbar').css('left', '');
      $('#01-introduction-navbar').css('position', '');

    }
    var duration = 5000; //In miliseconds
    setTimeout(removeStyling, duration);

  });
});
