function save() {
  // Construir el objeto data
  var data = {
    'codigo': $('#codigo').val(),
    'nombre': $('#nombre').val(),
    'precio': parseFloat($('#precio').val()),
    'cantidad': parseInt($('#cantidad').val()),
    'estado': parseInt($('#estado').val()),
  };

  var jsonData = JSON.stringify(data);
  $.ajax({
    url: 'http://localhost:9000/v1/api/producto',
    method: 'POST',
    dataType: 'json',
    contentType: 'application/json',
    data: jsonData,
    success: function (data) {
      alert("Registro agregado con éxito");
      loadData();
      clearData();
    },
    error: function (error) {
      console.error('Error en la solicitud:', error);
    }
  });
}

function update() {
  // Construir el objeto data
  var data = {
    'codigo': $('#codigo').val(),
    'nombre': $('#nombre').val(),
    'precio': parseFloat($('#precio').val()),
    'cantidad': parseInt($('#cantidad').val()),
    'estado': parseInt($('#estado').val()),
  };
  var id = $("#id").val();
  var jsonData = JSON.stringify(data);
  $.ajax({
    url: 'http://localhost:9000/v1/api/producto/' +id,
    data: jsonData,
    method: "PUT",
    headers: {
      "Content-Type": "application/json"
    }
  }).done(function (result) {
    alert("Registro actualizado con éxito");
    loadData();
    clearData();

    //actualzar boton
    var btnAgregar = $('button[name="btnAgregar"]');
    btnAgregar.text('Agregar');
    btnAgregar.attr('onclick', 'save()');
  })
}

function loadData() {
  $.ajax({
    url: 'http://localhost:9000/v1/api/producto',
    method: 'GET',
    dataType: 'json',
    success: function (data) {
      var html = '';

      data.forEach(function (item) {
        // Construir el HTML para cada objeto
        html += `<tr>
                <td>`+ item.codigo + `</td>
                <td>`+ item.nombre + `</td>
                <td>`+ item.precio + `</td>
                <td>`+ item.cantidad + `</td>
                <td>`+ (item.estado == true ? 'Activio' : 'Inactivo') + `</td>
                <th><img src="../asset/icon/pencil-square.svg" alt="" onclick="findById(`+ item.id + `)"></th>
                <th><img src="../asset/icon/trash3.svg" alt="" onclick="deleteById(`+ item.id + `)"></th>
            </tr>`;
      });

      $('#resultData').html(html);
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error('Error en la solicitud:', error);
    }
  });
}

function findById(id) {
  $.ajax({
    url: 'http://localhost:9000/v1/api/producto/' + id,
    method: 'GET',
    dataType: 'json',
    success: function (data) {
      $('#id').val(data.id);
      $('#codigo').val(data.codigo);
      $('#nombre').val(data.nombre);
      $('#precio').val(data.precio);
      $('#cantidad').val(data.cantidad);
      $('#estado').val(data.estado == true ? 1 : 0);

      //Cambiar boton.
      var btnAgregar = $('button[name="btnAgregar"]');
      btnAgregar.text('Actualizar');
      btnAgregar.attr('onclick', 'update()');
    },
    error: function (error) {
      // Función que se ejecuta si hay un error en la solicitud
      console.error('Error en la solicitud:', error);
    }
  });
}

function deleteById(id) {
  $.ajax({
    url: 'http://localhost:9000/v1/api/producto/' + id,
    method: "delete",
    headers: {
      "Content-Type": "application/json"
    }
  }).done(function (result) {
    alert("Registro eliminado con éxito");
    loadData();
    clearData();
  })
}

function clearData() {
  $('#id').val('');
  $('#codigo').val('');
  $('#nombre').val('');
  $('#precio').val('');
  $('#cantidad').val('');
  $('#estado').val('');
}

