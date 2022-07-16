import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CancelLinesFormComponent } from './cancel-lines-form.component';

describe('CancelLinesFormComponent', () => {
  let component: CancelLinesFormComponent;
  let fixture: ComponentFixture<CancelLinesFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CancelLinesFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CancelLinesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
