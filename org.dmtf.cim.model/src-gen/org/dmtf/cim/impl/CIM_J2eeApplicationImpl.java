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

import org.dmtf.cim.CIM_J2eeApplication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeApplicationImpl#getDeploymentDescriptor <em>Deployment Descriptor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeApplicationImpl extends CIM_ApplicationSystemImpl implements CIM_J2eeApplication {
	/**
	 * The default value of the '{@link #getDeploymentDescriptor() <em>Deployment Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentDescriptor()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_DESCRIPTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentDescriptor() <em>Deployment Descriptor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentDescriptor()
	 * @generated
	 * @ordered
	 */
	protected String deploymentDescriptor = DEPLOYMENT_DESCRIPTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeApplication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeploymentDescriptor() {
		return deploymentDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeploymentDescriptor(String newDeploymentDescriptor) {
		String oldDeploymentDescriptor = deploymentDescriptor;
		deploymentDescriptor = newDeploymentDescriptor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_APPLICATION__DEPLOYMENT_DESCRIPTOR, oldDeploymentDescriptor, deploymentDescriptor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_APPLICATION__DEPLOYMENT_DESCRIPTOR:
				return getDeploymentDescriptor();
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
			case CimPackage.CIM_J2EE_APPLICATION__DEPLOYMENT_DESCRIPTOR:
				setDeploymentDescriptor((String)newValue);
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
			case CimPackage.CIM_J2EE_APPLICATION__DEPLOYMENT_DESCRIPTOR:
				setDeploymentDescriptor(DEPLOYMENT_DESCRIPTOR_EDEFAULT);
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
			case CimPackage.CIM_J2EE_APPLICATION__DEPLOYMENT_DESCRIPTOR:
				return DEPLOYMENT_DESCRIPTOR_EDEFAULT == null ? deploymentDescriptor != null : !DEPLOYMENT_DESCRIPTOR_EDEFAULT.equals(deploymentDescriptor);
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
		result.append(" (DeploymentDescriptor: ");
		result.append(deploymentDescriptor);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeApplicationImpl
