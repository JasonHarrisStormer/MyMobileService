import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccountdetailsnavComponent } from './accountdetailsnav.component';

describe('AccountdetailsnavComponent', () => {
  let component: AccountdetailsnavComponent;
  let fixture: ComponentFixture<AccountdetailsnavComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccountdetailsnavComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AccountdetailsnavComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
