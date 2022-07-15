import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Iphone14Component } from './iphone14.component';

describe('Iphone14Component', () => {
  let component: Iphone14Component;
  let fixture: ComponentFixture<Iphone14Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Iphone14Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Iphone14Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
