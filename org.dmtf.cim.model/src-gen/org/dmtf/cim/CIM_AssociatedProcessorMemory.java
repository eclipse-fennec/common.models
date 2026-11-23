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
 * A representation of the model object '<em><b>CIM Associated Processor Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associates the Processor and system Memory, or a Processor's Cache.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedProcessorMemory#getBusSpeed <em>Bus Speed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedProcessorMemory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::Memory' override.Dependent='CIM_Processor REF' override.Dependent.Description='The Processor that accesses the Memory or uses the Cache.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedProcessorMemory extends CIM_AssociatedMemory {
	/**
	 * Returns the value of the '<em><b>Bus Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed of the bus, in MHertz, between the Processor and Memory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Speed</em>' attribute.
	 * @see #setBusSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedProcessorMemory_BusSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MegaHertz' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getBusSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedProcessorMemory#getBusSpeed <em>Bus Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Speed</em>' attribute.
	 * @see #getBusSpeed()
	 * @generated
	 */
	void setBusSpeed(Long value);

} // CIM_AssociatedProcessorMemory
