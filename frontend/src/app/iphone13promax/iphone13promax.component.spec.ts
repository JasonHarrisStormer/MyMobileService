import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Iphone13promaxComponent } from './iphone13promax.component';

describe('Iphone13promaxComponent', () => {
  let component: Iphone13promaxComponent;
  let fixture: ComponentFixture<Iphone13promaxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Iphone13promaxComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Iphone13promaxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
