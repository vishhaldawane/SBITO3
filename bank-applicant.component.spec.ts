import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BankApplicantComponent } from './bank-applicant.component';

describe('BankApplicantComponent', () => {
  let component: BankApplicantComponent;
  let fixture: ComponentFixture<BankApplicantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BankApplicantComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BankApplicantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
