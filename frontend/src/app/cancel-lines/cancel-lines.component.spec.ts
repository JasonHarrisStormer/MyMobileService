import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CancelLinesComponent } from './cancel-lines.component';

describe('CancelLinesComponent', () => {
  let component: CancelLinesComponent;
  let fixture: ComponentFixture<CancelLinesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CancelLinesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CancelLinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
