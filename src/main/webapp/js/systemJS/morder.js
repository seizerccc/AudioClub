$(function() {
    $('.btn-success').click(function() {
        window.alert($(this).parent().parent().children("td.t").text());

        var info={
            customerid:$(this).parent().parent().children("td.c").text(),
            productid:$(this).parent().parent().children("td.i").text(),
            ordertime:$(this).parent().parent().children("td.t").text()
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/morder",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 0){
                        //window.alert('delete success!');
                        window.location.href = baselocation + "/morder";
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
