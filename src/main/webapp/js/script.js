

myFunction = function(c) {
        var id = $(c).find('td.id').html();
        $('tr').removeClass();
        $(c).addClass('selected');
        $.get("index.action", {id: id}, function (responseText) {
            $('#selectedId').html($(responseText).find('div.tableforinsert').html());
            $('div#updbtn').addClass('updbtndisp');
        });
};
/*myFunction2 = function(c) {
    var id = $(c).find('td.id').html();
    var firstName = $(c).find('td.firstName').html();
    var lastName = $(c).find('td.lastName').html();
    var position = $(c).find('td.position').html();
    var department = $(c).find('td.department').html();
    var characteristic = $(c).find('td.characteristic').html();
    $.ajax({
        method: "POST",
        url: "index.action",
        data: {id: id,
            firstName: firstName,
            lastName: lastName,
            position: position,
            department: department,
            characteristic: characteristic
        },
        success:
            function (data) {
                $('#selectedId').html($(data).find('div.tableforinsert').html());
                $('div#updbtn').addClass('updbtndisp');
                $.ajax({
                    success:
                        function () {

                        }
                });
            }
    });
    $('tr').removeClass();
    $(c).addClass('selected');
};*/





