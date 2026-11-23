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
 * A representation of the model object '<em><b>CIM Allocated DMA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a LogicalDevice and a DMA System Resource indicating that the DMA Channel is assigned to the Device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedDMA#getBusMaster <em>Bus Master</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedDMA()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::SystemResources' override.Antecedent='CIM_DMA REF' override.Antecedent.Description='The DMA Channel.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice to which the Resource is assigned.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AllocatedDMA extends CIM_AllocatedResource {
	/**
	 * Returns the value of the '<em><b>Bus Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the LogicalDevice can act as a bus master on the DMA Channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Master</em>' attribute.
	 * @see #setBusMaster(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedDMA_BusMaster()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.6\"]'"
	 * @generated
	 */
	Boolean getBusMaster();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedDMA#getBusMaster <em>Bus Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Master</em>' attribute.
	 * @see #getBusMaster()
	 * @generated
	 */
	void setBusMaster(Boolean value);

} // CIM_AllocatedDMA
