$(function() {
    $('#btn_order').click(function() {
        var info = {
            message:1
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/detail",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 0){
                        window.alert('Order success!');
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
