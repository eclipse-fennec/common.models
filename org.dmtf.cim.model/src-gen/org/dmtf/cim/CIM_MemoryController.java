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
 * A representation of the model object '<em><b>CIM Memory Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MemoryController instances provide access to and management for their associated memory devices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemoryController#getProcessorAffinity <em>Processor Affinity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.54.1' UMLPackagePath='CIM::Device' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>Processor Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the controller has topology related constraints which limit its suitability for a given purpose they can be exposed using this property. If for example, the controller physical connectivity is such that it can be accessed from one processor in a multi-processor system its configurability is constrained to usages from that processor. In that case, ProcessorAffinity is set to the DeviceID of the processor."
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor Affinity</em>' attribute.
	 * @see #setProcessorAffinity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryController_ProcessorAffinity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_Processor.DeviceID\"]'"
	 * @generated
	 */
	String getProcessorAffinity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryController#getProcessorAffinity <em>Processor Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Affinity</em>' attribute.
	 * @see #getProcessorAffinity()
	 * @generated
	 */
	void setProcessorAffinity(String value);

} // CIM_MemoryController
