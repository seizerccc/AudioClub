$(function() {
    $('#music1').click(function() {
        var info =
            {
                prodname: $('#music1>div>h4').text()
            }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/catagory",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 1){
                        window.location.href = baselocation + "/detail";
                    }
                    else
                    {
                        window.alert('Invalid book , debug it!');
                    }
                }
            }
        )
    })
});
$(function() {
    $('#music2').click(function() {
        var info =
            {
                prodname: $('#music2>div>h4').text()
            }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/catagory",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 1){
                        window.location.href = baselocation + "/detail";
                    }
                    else
                    {
                        window.alert('Invalid book , debug it!');
                    }
                }
            }
        )
    })
});
$(function() {
    $('#music3').click(function() {
        var info =
            {
                prodname: $('#music3>div>h4').text()
            }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/catagory",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 1){
                        window.location.href = baselocation + "/detail";
                    }
                    else
                    {
                        window.alert('Invalid book , debug it!');
                    }
                }
            }
        )
    })
});
$(function() {
    $('#music4').click(function() {
        var info =
            {
                prodname: $('#music4>div>h4').text()
            }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/catagory",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 1){
                        window.location.href = baselocation + "/detail";
                    }
                    else
                    {
                        window.alert('Invalid book , debug it!');
                    }
                }
            }
        )
    })
});
$(function() {
    $('#music5').click(function() {
        var info =
            {
                prodname: $('#music5>div>h4').text()
            }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/catagory",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 1){
                        window.location.href = baselocation + "/detail";
                    }
                    else
                    {
                        window.alert('Invalid book , debug it!');
                    }
                }
            }
        )
    })
});
$(function() {
    $('#music6').click(function() {
        var info =
            {
                prodname: $('#music6>div>h4').text()
            }

        $.ajax(
            {
                type:'post',
                url:baselocation+"/catagory",
                data:info,
                dataType:'json',
                success : function (data) {
                    console.log(data);
                    if(data === 1){
                        window.location.href = baselocation + "/detail";
                    }
                    else
                    {
                        window.alert('Invalid book , debug it!');
                    }
                }
            }
        )
    })
});