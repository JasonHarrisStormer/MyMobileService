import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Galaxya53Component } from './galaxya53.component';

describe('Galaxya53Component', () => {
  let component: Galaxya53Component;
  let fixture: ComponentFixture<Galaxya53Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Galaxya53Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Galaxya53Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
