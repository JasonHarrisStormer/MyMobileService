import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewCxLinesFormComponent } from './new-cx-lines-form.component';

describe('NewCxLinesFormComponent', () => {
  let component: NewCxLinesFormComponent;
  let fixture: ComponentFixture<NewCxLinesFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewCxLinesFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewCxLinesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
