import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Iphone13Component } from './iphone13.component';

describe('Iphone13Component', () => {
  let component: Iphone13Component;
  let fixture: ComponentFixture<Iphone13Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Iphone13Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Iphone13Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
