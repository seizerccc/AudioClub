$(function () {
    $('#btn_register').click(function () {
        //检查
        if($('#name').val()=="")
        {
            window.alert('提示:姓名不能为空!');
            return;
        }
        if($('#password').val()=="")
        {
            window.alert('提示:密码不能为空!');
            return;
        }
        if($('#phone').val()=="")
        {
            window.alert('提示:联系方式不能为空!');
            return;
        }
        if($('#phone').val()=="")
        {
            window.alert('提示:地址不能为空!');
            return;
        }

        var info= {
            name : $("#name").val(),
            password : $("#password").val(),
            phone : $("#phone").val(),
            address : $("#address").val()
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/register",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 0){
                        window.alert('Register success!');
                        window.location.href = baselocation + "/caccount";
                    }
                    else
                    {
                        window.alert(data);
                    }
                }

            }
        )
        //window.location.href = baselocation + "/login";

    })
})