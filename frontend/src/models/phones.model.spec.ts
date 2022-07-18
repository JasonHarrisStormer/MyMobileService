import { Phones } from './phones.model';

describe('Phones', () => {
  it('should create an instance', () => {
    expect(new Phones('','', 0, '')).toBeTruthy();
  });
});