import { hilog } from '@kit.PerformanceAnalysisKit';

export class Logger {
  static PREFIX: string = 'testTag';
  static DOMAIN: number = 0xFF00;
  static FORMAT: string = '%{public}s, %{public}s';

  static debug(...args: string[]): void {
    hilog.debug(Logger.DOMAIN, Logger.PREFIX, Logger.FORMAT, args);
  }

  static info(...args: string[]): void {
    hilog.info(Logger.DOMAIN, Logger.PREFIX, Logger.FORMAT, args);
  }

  static warn(...args: string[]): void {
    hilog.warn(Logger.DOMAIN, Logger.PREFIX, Logger.FORMAT, args);
  }

  static error(...args: string[]): void {
    hilog.error(Logger.DOMAIN, Logger.PREFIX, Logger.FORMAT, args);
  }
}