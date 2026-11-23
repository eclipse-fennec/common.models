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
 * A representation of the model object '<em><b>CIM Queue For Print Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association indicates that a PrintService utilizes a particular PrintQueue.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_QueueForPrintService#getQueueAcceptingFromService <em>Queue Accepting From Service</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_QueueForPrintService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.14.0' UMLPackagePath='CIM::Device::Printing' override.Antecedent='CIM_PrintQueue REF' override.Antecedent.Description='The PrintQueue that the Service utilizes.' override.Dependent='CIM_PrintService REF' override.Dependent.Description='The PrintService that puts Jobs on the Queue.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_QueueForPrintService extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Queue Accepting From Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that the PrintService can accept Jobs and place them on the Queue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Accepting From Service</em>' attribute.
	 * @see #setQueueAcceptingFromService(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_QueueForPrintService_QueueAcceptingFromService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"RFC2911.IETF|Printer.printer-is-accepting-jobs\"]'"
	 * @generated
	 */
	Boolean getQueueAcceptingFromService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_QueueForPrintService#getQueueAcceptingFromService <em>Queue Accepting From Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Accepting From Service</em>' attribute.
	 * @see #getQueueAcceptingFromService()
	 * @generated
	 */
	void setQueueAcceptingFromService(Boolean value);

} // CIM_QueueForPrintService
