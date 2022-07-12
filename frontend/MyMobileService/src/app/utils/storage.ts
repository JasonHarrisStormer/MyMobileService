export const setPlans = (key:string, value: object) => {
  window.localStorage.setItem(key, JSON.stringify(value));
}

export const getPlans = (key:string) => {
  const value = window.localStorage.getItem(key);

  if (value) {
    return JSON.parse(value);
  }
}