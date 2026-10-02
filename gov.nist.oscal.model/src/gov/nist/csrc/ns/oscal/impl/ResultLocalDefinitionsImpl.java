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
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.AssessmentAssets;
import gov.nist.csrc.ns.oscal.InventoryItem;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.ResultLocalDefinitions;
import gov.nist.csrc.ns.oscal.SystemComponent;
import gov.nist.csrc.ns.oscal.SystemUser;
import gov.nist.csrc.ns.oscal.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Local Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultLocalDefinitionsImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultLocalDefinitionsImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultLocalDefinitionsImpl#getUser <em>User</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultLocalDefinitionsImpl#getAssessmentAssets <em>Assessment Assets</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResultLocalDefinitionsImpl#getAssessmentTask <em>Assessment Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResultLocalDefinitionsImpl extends MinimalEObjectImpl.Container implements ResultLocalDefinitions {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> component;

	/**
	 * The cached value of the '{@link #getInventoryItem() <em>Inventory Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItem()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryItem> inventoryItem;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUser> user;

	/**
	 * The cached value of the '{@link #getAssessmentAssets() <em>Assessment Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAssets()
	 * @generated
	 * @ordered
	 */
	protected AssessmentAssets assessmentAssets;

	/**
	 * The cached value of the '{@link #getAssessmentTask() <em>Assessment Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> assessmentTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultLocalDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getResultLocalDefinitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<SystemComponent>(SystemComponent.class, this, OSCALPackage.RESULT_LOCAL_DEFINITIONS__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryItem> getInventoryItem() {
		if (inventoryItem == null) {
			inventoryItem = new EObjectContainmentEList<InventoryItem>(InventoryItem.class, this, OSCALPackage.RESULT_LOCAL_DEFINITIONS__INVENTORY_ITEM);
		}
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemUser> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<SystemUser>(SystemUser.class, this, OSCALPackage.RESULT_LOCAL_DEFINITIONS__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAssets getAssessmentAssets() {
		return assessmentAssets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessmentAssets(AssessmentAssets newAssessmentAssets, NotificationChain msgs) {
		AssessmentAssets oldAssessmentAssets = assessmentAssets;
		assessmentAssets = newAssessmentAssets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, oldAssessmentAssets, newAssessmentAssets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessmentAssets(AssessmentAssets newAssessmentAssets) {
		if (newAssessmentAssets != assessmentAssets) {
			NotificationChain msgs = null;
			if (assessmentAssets != null)
				msgs = ((InternalEObject)assessmentAssets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, null, msgs);
			if (newAssessmentAssets != null)
				msgs = ((InternalEObject)newAssessmentAssets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, null, msgs);
			msgs = basicSetAssessmentAssets(newAssessmentAssets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS, newAssessmentAssets, newAssessmentAssets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getAssessmentTask() {
		if (assessmentTask == null) {
			assessmentTask = new EObjectContainmentEList<Task>(Task.class, this, OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_TASK);
		}
		return assessmentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				return ((InternalEList<?>)getInventoryItem()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				return basicSetAssessmentAssets(null, msgs);
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_TASK:
				return ((InternalEList<?>)getAssessmentTask()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__COMPONENT:
				return getComponent();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				return getInventoryItem();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__USER:
				return getUser();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				return getAssessmentAssets();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_TASK:
				return getAssessmentTask();
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
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends SystemComponent>)newValue);
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				getInventoryItem().clear();
				getInventoryItem().addAll((Collection<? extends InventoryItem>)newValue);
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends SystemUser>)newValue);
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				setAssessmentAssets((AssessmentAssets)newValue);
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_TASK:
				getAssessmentTask().clear();
				getAssessmentTask().addAll((Collection<? extends Task>)newValue);
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
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__COMPONENT:
				getComponent().clear();
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				getInventoryItem().clear();
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__USER:
				getUser().clear();
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				setAssessmentAssets((AssessmentAssets)null);
				return;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_TASK:
				getAssessmentTask().clear();
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
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__COMPONENT:
				return component != null && !component.isEmpty();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__INVENTORY_ITEM:
				return inventoryItem != null && !inventoryItem.isEmpty();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__USER:
				return user != null && !user.isEmpty();
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_ASSETS:
				return assessmentAssets != null;
			case OSCALPackage.RESULT_LOCAL_DEFINITIONS__ASSESSMENT_TASK:
				return assessmentTask != null && !assessmentTask.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResultLocalDefinitionsImpl
