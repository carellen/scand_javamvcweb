
myFunction = function(c) {
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
                $.ajax({
                    success:
                        function () {
                            $('tr').removeClass();
                            $('div#updbtn').removeClass();
                            $(c).addClass('selected');
                            $('div#updbtn').addClass('updbtndisp');
                        }
                });
            }
    });

};




