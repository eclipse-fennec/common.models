/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Owning Print Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates which Queue holds a PrintJob and where the Job is located within that Queue. A Job can remain on its final Queue when it has been printed with a PrintJobStatus of "Complete" or "Completed With Error".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OwningPrintQueue#getQueuePosition <em>Queue Position</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OwningPrintQueue()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.14.0' UMLPackagePath='CIM::Device::Printing' override.Antecedent='CIM_PrintQueue REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The PrintQueue on which the Job is held.' override.Dependent='CIM_PrintJob REF' override.Dependent.Weak='true' override.Dependent.Description='The PrintJob.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_OwningPrintQueue extends CIM_JobDestinationJobs {
	/**
	 * Returns the value of the '<em><b>Queue Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of the PrintJob on the Queue. The head of the Queue is indicated by a value of 1 with higher values being used to represent Jobs that are further away from the head of the Queue. A QueuePosition of 0 indicates that the Job has completed (either with or without error).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Position</em>' attribute.
	 * @see #setQueuePosition(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OwningPrintQueue_QueuePosition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|Job-Monitoring-MIB.jmNumberOfInterveningJobs\",\"MIB.IETF|Job-Monitoring-MIB.jmJobState\",\"RFC2911.IETF|Job.number-of-intervening-jobs\",\"RFC2911.IETF|Job.job-state\"]'"
	 * @generated
	 */
	Long getQueuePosition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OwningPrintQueue#getQueuePosition <em>Queue Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Position</em>' attribute.
	 * @see #getQueuePosition()
	 * @generated
	 */
	void setQueuePosition(Long value);

} // CIM_OwningPrintQueue
