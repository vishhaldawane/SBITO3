import { AstMemoryEfficientTransformer } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-test3',
  templateUrl: './test3.component.html',
  styleUrls: ['./test3.component.css']
})
export class Test3Component implements OnInit {
  requiredForm! : FormGroup;
  constructor(private fb: FormBuilder) {
    this.myForm();
   }
   myForm() {
    this.requiredForm = this.fb.group ( {
      uname:['',Validators.required],
      upass:['',Validators.required],
      uage:['',Validators.required],
      uaddress:['',Validators.required],
    })
   }

  ngOnInit(): void {
  }

}
