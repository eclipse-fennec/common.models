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

import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Origin;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.RequiredAsset;
import gov.nist.csrc.ns.oscal.Response;
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
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getRequiredAsset <em>Required Asset</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getTask <em>Task</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getLifecycle <em>Lifecycle</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ResponseImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseImpl extends MinimalEObjectImpl.Container implements Response {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<Origin> origin;

	/**
	 * The cached value of the '{@link #getRequiredAsset() <em>Required Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiredAsset> requiredAsset;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected static final String LIFECYCLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifecycle() <em>Lifecycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifecycle()
	 * @generated
	 * @ordered
	 */
	protected String lifecycle = LIFECYCLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESPONSE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESPONSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.RESPONSE__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.RESPONSE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Origin> getOrigin() {
		if (origin == null) {
			origin = new EObjectContainmentEList<Origin>(Origin.class, this, OSCALPackage.RESPONSE__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequiredAsset> getRequiredAsset() {
		if (requiredAsset == null) {
			requiredAsset = new EObjectContainmentEList<RequiredAsset>(RequiredAsset.class, this, OSCALPackage.RESPONSE__REQUIRED_ASSET);
		}
		return requiredAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this, OSCALPackage.RESPONSE__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESPONSE__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLifecycle() {
		return lifecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifecycle(String newLifecycle) {
		String oldLifecycle = lifecycle;
		lifecycle = newLifecycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESPONSE__LIFECYCLE, oldLifecycle, lifecycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.RESPONSE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.RESPONSE__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESPONSE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESPONSE__ORIGIN:
				return ((InternalEList<?>)getOrigin()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESPONSE__REQUIRED_ASSET:
				return ((InternalEList<?>)getRequiredAsset()).basicRemove(otherEnd, msgs);
			case OSCALPackage.RESPONSE__TASK:
				return ((InternalEList<?>)getTask()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.RESPONSE__TITLE:
				return getTitle();
			case OSCALPackage.RESPONSE__DESCRIPTION:
				return getDescription();
			case OSCALPackage.RESPONSE__PROP:
				return getProp();
			case OSCALPackage.RESPONSE__LINK:
				return getLink();
			case OSCALPackage.RESPONSE__ORIGIN:
				return getOrigin();
			case OSCALPackage.RESPONSE__REQUIRED_ASSET:
				return getRequiredAsset();
			case OSCALPackage.RESPONSE__TASK:
				return getTask();
			case OSCALPackage.RESPONSE__REMARKS:
				return getRemarks();
			case OSCALPackage.RESPONSE__LIFECYCLE:
				return getLifecycle();
			case OSCALPackage.RESPONSE__UUID:
				return getUuid();
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
			case OSCALPackage.RESPONSE__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.RESPONSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.RESPONSE__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.RESPONSE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.RESPONSE__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends Origin>)newValue);
				return;
			case OSCALPackage.RESPONSE__REQUIRED_ASSET:
				getRequiredAsset().clear();
				getRequiredAsset().addAll((Collection<? extends RequiredAsset>)newValue);
				return;
			case OSCALPackage.RESPONSE__TASK:
				getTask().clear();
				getTask().addAll((Collection<? extends Task>)newValue);
				return;
			case OSCALPackage.RESPONSE__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.RESPONSE__LIFECYCLE:
				setLifecycle((String)newValue);
				return;
			case OSCALPackage.RESPONSE__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.RESPONSE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.RESPONSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.RESPONSE__PROP:
				getProp().clear();
				return;
			case OSCALPackage.RESPONSE__LINK:
				getLink().clear();
				return;
			case OSCALPackage.RESPONSE__ORIGIN:
				getOrigin().clear();
				return;
			case OSCALPackage.RESPONSE__REQUIRED_ASSET:
				getRequiredAsset().clear();
				return;
			case OSCALPackage.RESPONSE__TASK:
				getTask().clear();
				return;
			case OSCALPackage.RESPONSE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.RESPONSE__LIFECYCLE:
				setLifecycle(LIFECYCLE_EDEFAULT);
				return;
			case OSCALPackage.RESPONSE__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.RESPONSE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.RESPONSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.RESPONSE__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.RESPONSE__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.RESPONSE__ORIGIN:
				return origin != null && !origin.isEmpty();
			case OSCALPackage.RESPONSE__REQUIRED_ASSET:
				return requiredAsset != null && !requiredAsset.isEmpty();
			case OSCALPackage.RESPONSE__TASK:
				return task != null && !task.isEmpty();
			case OSCALPackage.RESPONSE__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.RESPONSE__LIFECYCLE:
				return LIFECYCLE_EDEFAULT == null ? lifecycle != null : !LIFECYCLE_EDEFAULT.equals(lifecycle);
			case OSCALPackage.RESPONSE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", lifecycle: ");
		result.append(lifecycle);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //ResponseImpl
