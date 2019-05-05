$(function() {
    $('.btn-success').click(function() {
        window.alert($(this).parent().parent().children("td.t").text());

        var info={
            productid:$(this).parent().parent().children("td.i").text(),
            ordertime:$(this).parent().parent().children("td.t").text()
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/corder",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 0){
                        //window.alert('delete success!');
                        window.location.href = baselocation + "/corder";
                    }
                    else
                    {
                        window.alert(data);
                    }
                }

            }
        )
    })
});
