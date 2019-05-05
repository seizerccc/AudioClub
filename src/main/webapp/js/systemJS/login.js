$(function() {
    $('#goRegister').click(function() {
        window.location.href = baselocation + "/register";
    })
});

$(function() {
    $('#btn_login').click(function() {
        //运行一个简单的检查
        if($('#password').length>16){
            window.alert('密码超长');
            return;
        }
        else if($('#id').val()==""||$('#password').val()=="")
        {
            window.alert('提示:用户名或密码不能为空!');
            return;
        }
        else{
            var info = {
                id:$('#id').val(),
                password:$('#password').val(),
                usertype:$('#userType').val()
            }
        }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/login",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 1){
                        window.location.href = baselocation + "/home";
                    }
                    else
                    {
                        window.alert('Invalid name or password!');
                    }
                }

            }
        )


    })
});

