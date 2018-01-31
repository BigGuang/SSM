$(function () {
    var dt = $('#sysUserTable').DataTable({
        "processing": true,
        "ajax": "/model/sysUser/list.do",
        "columns": [
            {"data": "id"},
            {"data": "username"},
            {"data": "email"},
            {"data": "password"}
        ],
        "columnDefs": [
            {
                "render": function ( data, type, row ) {
                    var id=row.id;
                    return "<a href='#' onclick='edit(\"/model/sysUser/edit.do\",\""+id+"\")'>编辑</a> | <a href='#' onclick=\"del('/model/sysUser/del.do','"+id+"')\">删除</a>"
                },
                "targets": 4
            }
        ],
        "language": {
            "url": "//cdn.datatables.net/plug-ins/1.10.16/i18n/Chinese.json"
        },
        "order": [[1, 'asc']]
    });
});

