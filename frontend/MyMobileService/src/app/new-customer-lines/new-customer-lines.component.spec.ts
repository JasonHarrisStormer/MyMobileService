import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewCustomerLinesComponent } from './new-customer-lines.component';

describe('NewCustomerLinesComponent', () => {
  let component: NewCustomerLinesComponent;
  let fixture: ComponentFixture<NewCustomerLinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewCustomerLinesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewCustomerLinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
