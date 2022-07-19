import { TestBed } from '@angular/core/testing';

import { CancelLinesService } from './cancel-lines.service';

describe('CancelLinesService', () => {
  let service: CancelLinesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CancelLinesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
