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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_MemoryCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Memory Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getMemoryModes <em>Memory Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getReplicationSupport <em>Replication Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getReliabilitySupport <em>Reliability Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getChannelInterleaveSupport <em>Channel Interleave Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getChannelInterleaveWaySupport <em>Channel Interleave Way Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getMemoryControllerInterleaveSupport <em>Memory Controller Interleave Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryCapabilitiesImpl#getMemoryAffinitySupport <em>Memory Affinity Support</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MemoryCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_MemoryCapabilities {
	/**
	 * The cached value of the '{@link #getMemoryModes() <em>Memory Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> memoryModes;

	/**
	 * The cached value of the '{@link #getReplicationSupport() <em>Replication Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> replicationSupport;

	/**
	 * The cached value of the '{@link #getReliabilitySupport() <em>Reliability Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilitySupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> reliabilitySupport;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected Integer alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannelInterleaveSupport() <em>Channel Interleave Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelInterleaveSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> channelInterleaveSupport;

	/**
	 * The cached value of the '{@link #getChannelInterleaveWaySupport() <em>Channel Interleave Way Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelInterleaveWaySupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> channelInterleaveWaySupport;

	/**
	 * The cached value of the '{@link #getMemoryControllerInterleaveSupport() <em>Memory Controller Interleave Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryControllerInterleaveSupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> memoryControllerInterleaveSupport;

	/**
	 * The cached value of the '{@link #getMemoryAffinitySupport() <em>Memory Affinity Support</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryAffinitySupport()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> memoryAffinitySupport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemoryCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MemoryCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMemoryModes() {
		if (memoryModes == null) {
			memoryModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_MODES);
		}
		return memoryModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getReplicationSupport() {
		if (replicationSupport == null) {
			replicationSupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY_CAPABILITIES__REPLICATION_SUPPORT);
		}
		return replicationSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getReliabilitySupport() {
		if (reliabilitySupport == null) {
			reliabilitySupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY_CAPABILITIES__RELIABILITY_SUPPORT);
		}
		return reliabilitySupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlignment(Integer newAlignment) {
		Integer oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_CAPABILITIES__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getChannelInterleaveSupport() {
		if (channelInterleaveSupport == null) {
			channelInterleaveSupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_SUPPORT);
		}
		return channelInterleaveSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getChannelInterleaveWaySupport() {
		if (channelInterleaveWaySupport == null) {
			channelInterleaveWaySupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_WAY_SUPPORT);
		}
		return channelInterleaveWaySupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMemoryControllerInterleaveSupport() {
		if (memoryControllerInterleaveSupport == null) {
			memoryControllerInterleaveSupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_CONTROLLER_INTERLEAVE_SUPPORT);
		}
		return memoryControllerInterleaveSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMemoryAffinitySupport() {
		if (memoryAffinitySupport == null) {
			memoryAffinitySupport = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_AFFINITY_SUPPORT);
		}
		return memoryAffinitySupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_MODES:
				return getMemoryModes();
			case CimPackage.CIM_MEMORY_CAPABILITIES__REPLICATION_SUPPORT:
				return getReplicationSupport();
			case CimPackage.CIM_MEMORY_CAPABILITIES__RELIABILITY_SUPPORT:
				return getReliabilitySupport();
			case CimPackage.CIM_MEMORY_CAPABILITIES__ALIGNMENT:
				return getAlignment();
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_SUPPORT:
				return getChannelInterleaveSupport();
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_WAY_SUPPORT:
				return getChannelInterleaveWaySupport();
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_CONTROLLER_INTERLEAVE_SUPPORT:
				return getMemoryControllerInterleaveSupport();
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_AFFINITY_SUPPORT:
				return getMemoryAffinitySupport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_MODES:
				getMemoryModes().clear();
				getMemoryModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__REPLICATION_SUPPORT:
				getReplicationSupport().clear();
				getReplicationSupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__RELIABILITY_SUPPORT:
				getReliabilitySupport().clear();
				getReliabilitySupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__ALIGNMENT:
				setAlignment((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_SUPPORT:
				getChannelInterleaveSupport().clear();
				getChannelInterleaveSupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_WAY_SUPPORT:
				getChannelInterleaveWaySupport().clear();
				getChannelInterleaveWaySupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_CONTROLLER_INTERLEAVE_SUPPORT:
				getMemoryControllerInterleaveSupport().clear();
				getMemoryControllerInterleaveSupport().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_AFFINITY_SUPPORT:
				getMemoryAffinitySupport().clear();
				getMemoryAffinitySupport().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_MODES:
				getMemoryModes().clear();
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__REPLICATION_SUPPORT:
				getReplicationSupport().clear();
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__RELIABILITY_SUPPORT:
				getReliabilitySupport().clear();
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_SUPPORT:
				getChannelInterleaveSupport().clear();
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_WAY_SUPPORT:
				getChannelInterleaveWaySupport().clear();
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_CONTROLLER_INTERLEAVE_SUPPORT:
				getMemoryControllerInterleaveSupport().clear();
				return;
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_AFFINITY_SUPPORT:
				getMemoryAffinitySupport().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_MODES:
				return memoryModes != null && !memoryModes.isEmpty();
			case CimPackage.CIM_MEMORY_CAPABILITIES__REPLICATION_SUPPORT:
				return replicationSupport != null && !replicationSupport.isEmpty();
			case CimPackage.CIM_MEMORY_CAPABILITIES__RELIABILITY_SUPPORT:
				return reliabilitySupport != null && !reliabilitySupport.isEmpty();
			case CimPackage.CIM_MEMORY_CAPABILITIES__ALIGNMENT:
				return ALIGNMENT_EDEFAULT == null ? alignment != null : !ALIGNMENT_EDEFAULT.equals(alignment);
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_SUPPORT:
				return channelInterleaveSupport != null && !channelInterleaveSupport.isEmpty();
			case CimPackage.CIM_MEMORY_CAPABILITIES__CHANNEL_INTERLEAVE_WAY_SUPPORT:
				return channelInterleaveWaySupport != null && !channelInterleaveWaySupport.isEmpty();
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_CONTROLLER_INTERLEAVE_SUPPORT:
				return memoryControllerInterleaveSupport != null && !memoryControllerInterleaveSupport.isEmpty();
			case CimPackage.CIM_MEMORY_CAPABILITIES__MEMORY_AFFINITY_SUPPORT:
				return memoryAffinitySupport != null && !memoryAffinitySupport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (MemoryModes: ");
		result.append(memoryModes);
		result.append(", ReplicationSupport: ");
		result.append(replicationSupport);
		result.append(", ReliabilitySupport: ");
		result.append(reliabilitySupport);
		result.append(", Alignment: ");
		result.append(alignment);
		result.append(", ChannelInterleaveSupport: ");
		result.append(channelInterleaveSupport);
		result.append(", ChannelInterleaveWaySupport: ");
		result.append(channelInterleaveWaySupport);
		result.append(", MemoryControllerInterleaveSupport: ");
		result.append(memoryControllerInterleaveSupport);
		result.append(", MemoryAffinitySupport: ");
		result.append(memoryAffinitySupport);
		result.append(')');
		return result.toString();
	}

} //CIM_MemoryCapabilitiesImpl
