onclickFunction = function(c) {
        var id = $(c).find('td.id').html();
        $('tr').removeClass();
        $(c).addClass('selected');
        $.get("index.action", {id: id}, function (responseText) {
            $('#selectedId').html($(responseText).find('div.tableforinsert').html());
            $('div#updbtn').addClass('updbtndisp');
        });
};





