import { TestBed } from '@angular/core/testing';

import { GetlinesService } from './lines.service';

describe('GetlinesService', () => {
  let service: GetlinesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetlinesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
