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

import org.dmtf.cim.CIM_AutonomousSystem;
import org.dmtf.cim.CIM_BGPCluster;
import org.dmtf.cim.CIM_BGPClustersInAS;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Clusters In AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPClustersInASImpl#getGroupAS <em>Group AS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPClustersInASImpl#getPartAS <em>Part AS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPClustersInASImpl extends MinimalEObjectImpl.Container implements CIM_BGPClustersInAS {
	/**
	 * The cached value of the '{@link #getGroupAS() <em>Group AS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAS()
	 * @generated
	 * @ordered
	 */
	protected CIM_AutonomousSystem groupAS;

	/**
	 * The cached value of the '{@link #getPartAS() <em>Part AS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartAS()
	 * @generated
	 * @ordered
	 */
	protected CIM_BGPCluster partAS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPClustersInASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPClustersInAS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_AutonomousSystem getGroupAS() {
		if (groupAS != null && groupAS.eIsProxy()) {
			InternalEObject oldGroupAS = (InternalEObject)groupAS;
			groupAS = (CIM_AutonomousSystem)eResolveProxy(oldGroupAS);
			if (groupAS != oldGroupAS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_BGP_CLUSTERS_IN_AS__GROUP_AS, oldGroupAS, groupAS));
			}
		}
		return groupAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_AutonomousSystem basicGetGroupAS() {
		return groupAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupAS(CIM_AutonomousSystem newGroupAS) {
		CIM_AutonomousSystem oldGroupAS = groupAS;
		groupAS = newGroupAS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_CLUSTERS_IN_AS__GROUP_AS, oldGroupAS, groupAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_BGPCluster getPartAS() {
		if (partAS != null && partAS.eIsProxy()) {
			InternalEObject oldPartAS = (InternalEObject)partAS;
			partAS = (CIM_BGPCluster)eResolveProxy(oldPartAS);
			if (partAS != oldPartAS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_BGP_CLUSTERS_IN_AS__PART_AS, oldPartAS, partAS));
			}
		}
		return partAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_BGPCluster basicGetPartAS() {
		return partAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartAS(CIM_BGPCluster newPartAS) {
		CIM_BGPCluster oldPartAS = partAS;
		partAS = newPartAS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_CLUSTERS_IN_AS__PART_AS, oldPartAS, partAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__GROUP_AS:
				if (resolve) return getGroupAS();
				return basicGetGroupAS();
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__PART_AS:
				if (resolve) return getPartAS();
				return basicGetPartAS();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__GROUP_AS:
				setGroupAS((CIM_AutonomousSystem)newValue);
				return;
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__PART_AS:
				setPartAS((CIM_BGPCluster)newValue);
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
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__GROUP_AS:
				setGroupAS((CIM_AutonomousSystem)null);
				return;
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__PART_AS:
				setPartAS((CIM_BGPCluster)null);
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
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__GROUP_AS:
				return groupAS != null;
			case CimPackage.CIM_BGP_CLUSTERS_IN_AS__PART_AS:
				return partAS != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_BGPClustersInASImpl
