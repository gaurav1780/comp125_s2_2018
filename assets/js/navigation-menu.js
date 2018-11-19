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
  });
});
