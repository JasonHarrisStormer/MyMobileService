import { ComponentFixture, TestBed } from '@angular/core/testing';

import { S23Component } from './s23.component';

describe('S23Component', () => {
  let component: S23Component;
  let fixture: ComponentFixture<S23Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ S23Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(S23Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
