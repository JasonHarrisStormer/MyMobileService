import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewCustomerPhoneComponent } from './new-customer-phone.component';

describe('NewCustomerPhoneComponent', () => {
  let component: NewCustomerPhoneComponent;
  let fixture: ComponentFixture<NewCustomerPhoneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewCustomerPhoneComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewCustomerPhoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
