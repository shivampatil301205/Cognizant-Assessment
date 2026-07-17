import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails() {
  const cohorts = [
    {
      id: 1,
      title: "INTADMDF10 -.NET FSD",
      startedOn: "22-Feb-2022",
      status: "Scheduled",
      coach: "Aarthma",
      trainer: "Shivam Patil"
    },
    {
      id: 2,
      title: "ADM21JF014 - Java FSD",
      startedOn: "10-Sep-2021",
      status: "Ongoing",
      coach: "Apoorv",
      trainer: "Rohan Sharma"
    },
    {
      id: 3,
      title: "CDBJF21025 - Java FSD",
      startedOn: "24-Dec-2021",
      status: "Ongoing",
      coach: "Aarthma",
      trainer: "Priya Patel"
    }
  ];

  return (
    <div>
      <h2>Cohorts Details</h2>
      <div>
        {cohorts.map(cohort => (
          <div key={cohort.id} className={styles.box}>
            <h3 style={{ color: cohort.status.toLowerCase() === 'ongoing' ? 'green' : 'blue' }}>
              {cohort.title}
            </h3>
            <dl>
              <dt>Started On</dt>
              <dd>{cohort.startedOn}</dd>
              <dt>Current Status</dt>
              <dd>{cohort.status}</dd>
              <dt>Coach</dt>
              <dd>{cohort.coach}</dd>
              <dt>Trainer</dt>
              <dd>{cohort.trainer}</dd>
            </dl>
          </div>
        ))}
      </div>
    </div>
  );
}

export default CohortDetails;
