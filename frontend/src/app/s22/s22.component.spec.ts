import { ComponentFixture, TestBed } from '@angular/core/testing';

import { S22Component } from './s22.component';

describe('S22Component', () => {
  let component: S22Component;
  let fixture: ComponentFixture<S22Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ S22Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(S22Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
