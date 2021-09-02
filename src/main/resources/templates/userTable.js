var baseurlusers = "http://localhost:9000/users";
var baseurlpages = "http://localhost:9000/pages";
function loadUsers(){

  var xmlhttp = new XMLHttpRequest();
  var xmlhttppages = new XMLHttpRequest();
  xmlhttp.open("GET",baseurlusers + "/all",true);
  xmlhttppages.open("GET", baseurlpages + "/all", true);
  xmlhttppages.onreadystatechange = function(){
  xmlhttp.onreadystatechange = function() {
    if(xmlhttp.readyState ===4 && xmlhttp.status ===200 && (xmlhttppages.readyState ===4 && xmlhttppages.status ===200)){
      var users = JSON.parse(xmlhttp.responseText);
      var pages = JSON.parse(xmlhttppages.responseText);
      const list_elements = document.getElementById('list');
      const pagination_element = document.getElementById('pagination');
      let current_page = 1;
      let rows = pages[0].per_page;

      function DisplayList(items, wrapper){
        wrapper.innerHTML = items;
      }

      function Slicer(items, page, rows_per_page){
        page--;
        let start = rows_per_page * page;
        let end = start + rows_per_page;
        return items.slice(start,end);
      }

      function SetupPagination(items, wrapper, rows_per_page){
        wrapper.innerHTML = "";
        let page_count = Math.ceil(items.length / rows_per_page);
        for (let i = 1 ; i < page_count + 1; i++){
          let btn = PaginationButtom(i, Slicer(items, i, rows_per_page));
          wrapper.appendChild(btn);
        }

      }

      function PaginationButtom(page, items){
        let button = document.createElement('button');
        button.innerText = page;

        if (current_page == page) button.classList.add('active');

        button.addEventListener('click', function(){
          current_page = page;
          DisplayList([items], list_elements);

          let current_btn = document.querySelector('.pagenumbers button.active');
          current_btn.classList.remove('active');

          button.classList.add('active'); 
        });

        return button;
      }
      var content = [];
      for (i = 0; i < users.length; i++){

        let main = `<div class='yanobg' id='tudo lindo aqui'">User ID: `+users[i].id+" Email: "+users[i].email+" First Name: "+users[i].first_name+" Last Name: "+users[i].last_name;
        let img = `<img src='${users[i].avatar}'></img>`;
        content.push(main + img + '<br></br>');
      }
      DisplayList(Slicer(content, current_page, rows), list_elements);
      SetupPagination(content, pagination_element, rows);

    }
  };};
  xmlhttppages.send();
  xmlhttp.send();
}
window.onload = function(){
  loadUsers();
}