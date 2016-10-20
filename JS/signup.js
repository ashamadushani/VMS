/**
 * Created by Dili on 12/06/2016.
 */

$().ready(function(){
    $('#btn-signup').click(function(){

    $("#signupform").validate({
        rules:{
            fname:{
                required: true,
                TestOnly: true
            },
            mid:{
                required: true,
                remote:{url: "../../app/controller/memberID_check.php",
                    type: "post"}
            },
            nic:{
                required: true,
                NIC:true,
                remote:{url: "../../app/controller/check_nic.php",
                    type: "post"}
            },
            email:{
                required: true,
                HEmail:true,
                remote:{url: "../../app/controller/email_check.php",
                    type: "post"}
            },
            mobile:{
                required:true,
                Mobile: true
            },
            doj:{
                required:true
               /* EndDate: { greaterThan: "#doj" }*/
            },
            clubpost:{
                required:true
            },
            username:{
                required:true,
                remote:{url: "../../app/controller/username_check.php",
                type: "post"}

            },
            pwd:{
                required:true
            },
            confirmpwd:{
                required:true,
                equalTo: "#pwd"
            }

        },

        messages:{
            fname:{
                required: "Please enter your full name"
            },
            mid:{
                required:"Please enter your Member ID",
                remote: "Already Account is created with this Member ID!"
            },
            nic:{
                required:"Please enter your National ID card Number",
                remote: "Already Account is created with this NIC!"
            },
           email:{
                required:"Please enter your current email address",
                remote: "Already Account is created with this email!"
            },
            mobile:{
                required:"Please enter your mobile number"
            },
            doj:{
                required:"Please enter your Date of Join"
            },
            clubpost:{
                required:"Please enter your Club Post"
            },
            username:{
                required:"Please enter valid Username",
                remote: "Username already in use!"
            },
            pwd:{
                required:"Please enter valid password"
            },
            confirmpwd:{
                required:"Please re-enter the password"
            }
        },

        submitHandler: function(form) {

            //get input field values data to be sent to server
            var m_data = new FormData();
            m_data.append( 'fname',  document.getElementById("fname").value);
            m_data.append( 'mid',  document.getElementById("mid").value);
            m_data.append( 'nic',  document.getElementById("nic").value);
            m_data.append( 'email',  document.getElementById("email").value);
            m_data.append( 'mobile',  document.getElementById("mobile").value);
            m_data.append( 'doj',  document.getElementById("doj").value);
            m_data.append( 'clubpost',  document.getElementById("clubpost").value);
            m_data.append( 'username',  document.getElementById("username").value);
            m_data.append( 'confirmpwd',  document.getElementById("confirmpwd").value);
            // Ajax post data to server
            $.ajax({
                type: "POST",
                url: '../../app/controller/member_signup.php',
                data: $("#signupform").serialize(), // serializes the form's elements.
                success: function(data)
                {

                        $("#signupform").slideUp("slow",function(){
                            $("#signup-success").removeClass("hidden",function(){
                                $("#signup-success").fadeIn(600);
                            });
                        });

                }

            });
        }

    });
        $("#signup-form").css({"height":"235%"});
    });
});

jQuery.validator.addMethod("NIC",function(value,element){
    return this.optional(element) || /^[0-9]{9}[V||X||v||x]{1}$/.test(value) ||/^[0-9]{12}$/.test(value);
},"Not a valid NIC number");

jQuery.validator.addMethod("HEmail",function(value,element){
    return this.optional(element) || /^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/.test(value);
},"Please enter valid email");

jQuery.validator.addMethod("Mobile",function(value,element){
    return this.optional(element) || /^[0-9]{10}$/.test(value);
},"Not a valid mobile number");

jQuery.validator.addMethod("TestOnly",function(value,element){
    return this.optional(element) || /^[a-zA-Z][a-zA-Z ]*$/.test(value);
},"space and alphabetical characters");

/*jQuery.validator.addMethod("greaterThan",
    function(value, element, params) {

        if (!/Invalid|NaN/.test(new Date(value))) {
            return new Date(value) > new Date($(params).val());
        }

        return isNaN(value) && isNaN($(params).val())
        || (Number(value) > Number($(params).val()));
    },'Must be greater than {0}.');*/

/*
 ^[A-Z||a-z]+$   oly for alphabet*/