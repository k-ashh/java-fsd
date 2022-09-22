function checkValidation(){

   let name=document.getElementById("name").value;
   let email=document.getElementById("email").value;
   let subject=document.getElementById("subject").value;
   let phone=document.getElementById("phone").value;
   let message=document.getElementById("message").value;
   
   let flag=1
   let statusOfname=""
   let statusOfemail=""
   let statusOfsubject=""
   let statusOfphone=""
   if(name==""){
      statusOfname="Name should not be Empty"
      flag=0
   }
   if(email==""){
      statusOfemail="Email should not be Empty"
      flag=0 
   }
    if(subject==""){
      statusOfsubject="Subject should not be Empty"
      flag=0 
     }
   if(phone==""){
      statusOfphone="Phone number should not be Empty"
      flag=0 
   }
   if(flag==0){
      alert(statusOfname+"\n"+statusOfemail+"\n"+statusOfsubject+"\n"+statusOfphone);
   }else{
      alert("Your feedback is submitted sucessfully...")
   }
}
 