import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewLinesComponent } from './new-lines.component';

describe('NewLinesComponent', () => {
  let component: NewLinesComponent;
  let fixture: ComponentFixture<NewLinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewLinesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewLinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
