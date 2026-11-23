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

import org.dmtf.cim.CIM_Cluster;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ClusterImpl#getInterconnect <em>Interconnect</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ClusterImpl#getInterconnectAddress <em>Interconnect Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ClusterImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ClusterImpl#getMaxNumberOfNodes <em>Max Number Of Nodes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ClusterImpl#getClusterState <em>Cluster State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ClusterImpl extends CIM_ComputerSystemImpl implements CIM_Cluster {
	/**
	 * The default value of the '{@link #getInterconnect() <em>Interconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnect()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERCONNECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterconnect() <em>Interconnect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnect()
	 * @generated
	 * @ordered
	 */
	protected String interconnect = INTERCONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterconnectAddress() <em>Interconnect Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERCONNECT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterconnectAddress() <em>Interconnect Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectAddress()
	 * @generated
	 * @ordered
	 */
	protected String interconnectAddress = INTERCONNECT_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> types;

	/**
	 * The default value of the '{@link #getMaxNumberOfNodes() <em>Max Number Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfNodes()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUMBER_OF_NODES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfNodes() <em>Max Number Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfNodes()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumberOfNodes = MAX_NUMBER_OF_NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClusterState() <em>Cluster State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLUSTER_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClusterState() <em>Cluster State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClusterState()
	 * @generated
	 * @ordered
	 */
	protected Integer clusterState = CLUSTER_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Cluster();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterconnect() {
		return interconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterconnect(String newInterconnect) {
		String oldInterconnect = interconnect;
		interconnect = newInterconnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLUSTER__INTERCONNECT, oldInterconnect, interconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterconnectAddress() {
		return interconnectAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterconnectAddress(String newInterconnectAddress) {
		String oldInterconnectAddress = interconnectAddress;
		interconnectAddress = newInterconnectAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLUSTER__INTERCONNECT_ADDRESS, oldInterconnectAddress, interconnectAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getTypes() {
		if (types == null) {
			types = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CLUSTER__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumberOfNodes() {
		return maxNumberOfNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberOfNodes(Long newMaxNumberOfNodes) {
		Long oldMaxNumberOfNodes = maxNumberOfNodes;
		maxNumberOfNodes = newMaxNumberOfNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLUSTER__MAX_NUMBER_OF_NODES, oldMaxNumberOfNodes, maxNumberOfNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClusterState() {
		return clusterState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClusterState(Integer newClusterState) {
		Integer oldClusterState = clusterState;
		clusterState = newClusterState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CLUSTER__CLUSTER_STATE, oldClusterState, clusterState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CLUSTER__INTERCONNECT:
				return getInterconnect();
			case CimPackage.CIM_CLUSTER__INTERCONNECT_ADDRESS:
				return getInterconnectAddress();
			case CimPackage.CIM_CLUSTER__TYPES:
				return getTypes();
			case CimPackage.CIM_CLUSTER__MAX_NUMBER_OF_NODES:
				return getMaxNumberOfNodes();
			case CimPackage.CIM_CLUSTER__CLUSTER_STATE:
				return getClusterState();
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
			case CimPackage.CIM_CLUSTER__INTERCONNECT:
				setInterconnect((String)newValue);
				return;
			case CimPackage.CIM_CLUSTER__INTERCONNECT_ADDRESS:
				setInterconnectAddress((String)newValue);
				return;
			case CimPackage.CIM_CLUSTER__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CLUSTER__MAX_NUMBER_OF_NODES:
				setMaxNumberOfNodes((Long)newValue);
				return;
			case CimPackage.CIM_CLUSTER__CLUSTER_STATE:
				setClusterState((Integer)newValue);
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
			case CimPackage.CIM_CLUSTER__INTERCONNECT:
				setInterconnect(INTERCONNECT_EDEFAULT);
				return;
			case CimPackage.CIM_CLUSTER__INTERCONNECT_ADDRESS:
				setInterconnectAddress(INTERCONNECT_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_CLUSTER__TYPES:
				getTypes().clear();
				return;
			case CimPackage.CIM_CLUSTER__MAX_NUMBER_OF_NODES:
				setMaxNumberOfNodes(MAX_NUMBER_OF_NODES_EDEFAULT);
				return;
			case CimPackage.CIM_CLUSTER__CLUSTER_STATE:
				setClusterState(CLUSTER_STATE_EDEFAULT);
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
			case CimPackage.CIM_CLUSTER__INTERCONNECT:
				return INTERCONNECT_EDEFAULT == null ? interconnect != null : !INTERCONNECT_EDEFAULT.equals(interconnect);
			case CimPackage.CIM_CLUSTER__INTERCONNECT_ADDRESS:
				return INTERCONNECT_ADDRESS_EDEFAULT == null ? interconnectAddress != null : !INTERCONNECT_ADDRESS_EDEFAULT.equals(interconnectAddress);
			case CimPackage.CIM_CLUSTER__TYPES:
				return types != null && !types.isEmpty();
			case CimPackage.CIM_CLUSTER__MAX_NUMBER_OF_NODES:
				return MAX_NUMBER_OF_NODES_EDEFAULT == null ? maxNumberOfNodes != null : !MAX_NUMBER_OF_NODES_EDEFAULT.equals(maxNumberOfNodes);
			case CimPackage.CIM_CLUSTER__CLUSTER_STATE:
				return CLUSTER_STATE_EDEFAULT == null ? clusterState != null : !CLUSTER_STATE_EDEFAULT.equals(clusterState);
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
		result.append(" (Interconnect: ");
		result.append(interconnect);
		result.append(", InterconnectAddress: ");
		result.append(interconnectAddress);
		result.append(", Types: ");
		result.append(types);
		result.append(", MaxNumberOfNodes: ");
		result.append(maxNumberOfNodes);
		result.append(", ClusterState: ");
		result.append(clusterState);
		result.append(')');
		return result.toString();
	}

} //CIM_ClusterImpl
