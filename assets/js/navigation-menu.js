---
layout: null
---
'use strict';

var introduction = '01-introduction';

function toggleNavBar(collectionName) {
  var collectionId = '#' + collectionName;
  var collectionNavbar = collectionId + '-navbar';
  console.log(collectionNavbar);
  $(collectionId).click(function(e) {
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
    
    $(collectionNavbar).css('display', 'block');
    $(collectionNavbar).css('top', '0%');
    $(collectionNavbar).css('left', '100%');
    $(collectionNavbar).css('position', 'absolute');
    // Set timeout so it revertws back to hidden.
    function removeStyling() {
      $(collectionNavbar).css('display', '');
      $(collectionNavbar).css('top', '');
      $(collectionNavbar).css('left', '');
      $(collectionNavbar).css('position', '');

    }
    var duration = 5000; //In miliseconds
    setTimeout(removeStyling, duration);

  });
}

$(document).ready(function(){
  //toggleNavBar(introduction);
  {% for collection in site.data.navigation-list.navigation_list %}
    {%- assign id = collection.id -%}
    toggleNavBar('{{ id }}');
  {% endfor %}
});
