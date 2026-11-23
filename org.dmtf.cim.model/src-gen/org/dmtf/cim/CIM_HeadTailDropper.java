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
 * A representation of the model object '<em><b>CIM Head Tail Dropper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HeadTailDropper describes the threshold information of a head or tail dropper. The inherited property DropFrom indicates whether a particular instance of this class is a head dropper or a tail dropper. 
 * 
 * A head dropper always examines the same queue from which it drops packets, and this queue is always related to the dropper as the following service in the NextService association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_HeadTailDropper#getQueueThreshold <em>Queue Threshold</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HeadTailDropper()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_HeadTailDropper extends CIM_DropperService {
	/**
	 * Returns the value of the '<em><b>Queue Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an unsigned 32-bit integer that indicates the queue depth (in bytes) at which traffic is dropped. For a tail dropper, all newly arriving traffic is dropped. For a head dropper, packets at the front of the queue are dropped to make room for new packets, which are added at the end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Threshold</em>' attribute.
	 * @see #setQueueThreshold(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_HeadTailDropper_QueueThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getQueueThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_HeadTailDropper#getQueueThreshold <em>Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Threshold</em>' attribute.
	 * @see #getQueueThreshold()
	 * @generated
	 */
	void setQueueThreshold(Long value);

} // CIM_HeadTailDropper
