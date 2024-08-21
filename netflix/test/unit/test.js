// test/unit/test.js
const chai = require('chai');
const chaiHttp = require('chai-http');
const app = require('../../src/app');
const expect = chai.expect;

chai.use(chaiHttp);

describe('Basic Test', () => {
    it('should return a welcome message', (done) => {
        chai.request(app)
            .get('/')
            .end((err, res) => {
                expect(res).to.have.status(200);
                expect(res.text).to.equal('Welcome to Netflix-like App');
                done();
            });
    });
});

