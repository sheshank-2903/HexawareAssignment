import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';


  registerForm!: FormGroup;
  
  submitted=false;


  constructor(private formBuilder: FormBuilder){

  }

  ngOnInit(){
    
  this.registerForm=this.formBuilder.group({

    firstName:['',[Validators.required,Validators.minLength(3)]],
    lastName:['',[Validators.required,Validators.pattern('[A-Z][a-z]{4}')]],
    email:['',[Validators.required,Validators.email]],
    password:['',[Validators.required,Validators.minLength(5),Validators.maxLength(10)]]
  });
}

//f is a getter function which returns form controls
get f(){
  
  return this.registerForm.controls;
}

onSubmit(){

  this.submitted=true;
  if(this.registerForm.invalid){
    return;
}

alert('Form submitted successfully');
console.log(this.f['firstName'].value);

}
}
